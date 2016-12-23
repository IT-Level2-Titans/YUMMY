package com.mkyong.rest;
 
import com.mongodb.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.net.UnknownHostException;
import java.util.Set;


//@Path-----this annotation is  containing the desired URL the servlet should listen on.
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/world/{param}")
	public Response getMsg(@PathParam("param") String msg) {


		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/mongo/{param}")
	public Response getMongo(@PathParam("param") String msg) throws UnknownHostException {

		String output = "Jersey say : " + msg;
		//MongoClient mongo = new MongoClient( "localhost" , 27017 );
		//DB db = mongo.getDB("database name");

		return Response.status(200).entity(output).build();


	}

	public static  void main(String[] args) throws UnknownHostException {

		//To connect to the mongodb server
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		//connect to the database
		DB db = mongo.getDB("Titans");
		//Set<String> tables = db.getCollectionNames();
		DBCollection table = db.getCollection("Food_Item");

		/*DBCursor cursor = table.find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			System.out.println("Food_Item : " + obj.toString());
		}*/

		BasicDBObject doc = new BasicDBObject();
		doc.put("Food_Item_Id","4");
		doc.put("Food_Item_Name","Hoppers");
		System.out.println("Document inserted successfully");
		table.insert(doc);
	}
 
}