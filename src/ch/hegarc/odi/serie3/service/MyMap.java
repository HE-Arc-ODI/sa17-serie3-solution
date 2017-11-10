package ch.hegarc.odi.serie3.service;

import java.util.HashMap;

public class MyMap {

    private HashMap data;

    public MyMap(){
        data = new HashMap <Integer, String>();
        data.put(61512, "Gestion et suivi de projets informatiques");
        data.put(61513, "Gestion et suivi de projets informatiques (prat)");
        data.put(61514, "Gestion de projets agiles");
        data.put(62511, "Industrialisation du logiciel");
        data.put(62512, "Outils de développement intégré");
        data.put(62513, "Outils de développement intégré (prat)");
        data.put(62522, "Entrepôt de données");
        data.put(62523, "Entrepôt de données (prat)");
        data.put(62524, "Analyses de données");
        data.put(63511, "Technologies actuelles");
        data.put(63512, "Recherche opérationnelle");
        data.put(63513, "Concepts avancés de persistance");
        data.put(64511, "Gestion des contenus de l'entreprise");
        data.put(64512, "Gestion des données semi-structurées");
        data.put(64521, "Projet RAD");
    }

    public String getValue(Integer p){
        return (String) data.get(p);
    }

}
