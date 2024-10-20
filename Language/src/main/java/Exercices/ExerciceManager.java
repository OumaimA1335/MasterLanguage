/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marwa
 */
public class ExerciceManager {
     private List<Exercice> exercices;

    public ExerciceManager() {
        exercices = new ArrayList<>();
    }

    public List<Exercice> getExercices() {
        return exercices;
    }

    public void setExercices(List<Exercice> exercices) {
        this.exercices = exercices;
    }

    
    public void addExercice(Exercice exercice) {
        exercices.add(exercice);
        System.out.println("Exercise added successfully!");
    }
    
     // Update an exercise by index
    public void updateExercice(int index, Exercice newExercice) {
        if (index >= 0 && index < exercices.size()) {
            exercices.set(index, newExercice);
            System.out.println("Exercice updated!");
        } else {
            System.out.println("Invalid index. Cannot update exercise!");
        }
    }
    
    public void deleteExercice(int index) {
        if (index >= 0 && index < exercices.size()) {
            exercices.remove(index);
            System.out.println("Exercise deleted successfully!");
        } else {
            System.out.println("Invalid index. Cannot delete exercise!");
        }
    }
    
    public void displayExercices() {
        for (int i = 0; i < exercices.size(); i++) {
            System.out.println(i + ": " + exercices.get(i).toString());
        }
    }
    
}
