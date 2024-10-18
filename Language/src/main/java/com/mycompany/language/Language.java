/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.language;

import Lesson.LessonPlan;

/**
 *
 * @author ASUS
 */
public class Language {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LessonPlan l = new LessonPlan();
        l.ajouterLesson();
        l.afficher();

        System.out.println("******************");
        System.out.println("Ajout un mot à une lesson!");
        try {
            l.remplissageTab(1);
        } catch (MyException e) {
            System.out.println(e);
        }
        l.afficher();

        System.out.println("******************");
        System.out.println("Modification!");
        try {
            l.modifier(1);
        } catch (MyException e) {
            System.out.println(e);
        }
        System.out.println("******************");
        System.out.println("Affichage!");
        l.afficher();

        System.out.println("******************");
        System.out.println("Suppression!");
        try {
            l.supprimer(1);
        } catch (MyException e) {
            System.out.println(e);
        }
        System.out.println("******************");
        System.out.println("Affichage!");
        l.afficher();
        System.out.println("******************");
        System.out.println("Affichage des lessons vocabulaire !");
        l.listeVocabLesson();
        System.out.println("******************");
        System.out.println("Affichage des lessons grammaire !");
        l.ListeGrammaLesson();

    }
}
