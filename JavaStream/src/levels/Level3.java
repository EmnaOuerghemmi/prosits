package levels;

import models.Teacher;
import utils.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream().map(Teacher::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining("#"));/* TO DO 1  hint(reduce)*/;
        System.out.println(names);
        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream().filter(teacher -> teacher.getName().equalsIgnoreCase("Java") && teacher.getSalary() > 80000)
                .collect(Collectors.toSet());;/* TO DO 3 */;
        System.out.println(teachers1);
        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Teacher::getName)
                .thenComparingDouble(Teacher::getSalary))));/* TO DO 4 */;
        System.out.println(teachers2);
        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<models.Subject, List<Teacher>> map = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSubject));
        System.out.println(map);
        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream().collect(Collectors.groupingBy(Teacher::getSalary,
                Collectors.mapping(Teacher::getName, Collectors.joining(", "))));

        System.out.println(map1);/*TO DO 6*/;


    }
}
