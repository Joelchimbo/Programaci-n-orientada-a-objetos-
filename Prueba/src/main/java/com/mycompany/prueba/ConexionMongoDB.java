/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author chimn
 */
public class ConexionMongoDB {
    private MongoCollection<Document> productosCollection;

    public ConexionMongoDB() {
        // Inicializar la conexión a la base de datos MongoDB
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("inventario");
        productosCollection = database.getCollection("productos");
    }

    public MongoCollection<Document> getProductosCollection() {
        return productosCollection;
    }
}

