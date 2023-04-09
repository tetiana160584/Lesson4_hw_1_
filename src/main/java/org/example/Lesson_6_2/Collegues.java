package org.example.Lesson_6_2;

public  class Collegues {
    public class JavaDeveloper extends Employee {
        public JavaDeveloper(String name) {
            super("Tom");
        }

        @Override
        public String getPosition() {
            return "JavaDeveloper";
        }

        @Override
        public String getSeniority() {
            return "Senior";
        }

        }

        public class AngularDeveloper extends Employee {

            public AngularDeveloper(String name) {
                super("Bill");
            }

            @Override
            public String getPosition() {
                return "Angular Developer";
            }

            @Override
            public String getSeniority() {
                return "Middle";
            }
        }

        public class AutomationEngineer extends Employee {
            public final String LastName;

            public AutomationEngineer(String name, String LastName) {
                super("Misha");
                this.LastName = LastName;

            }

            @Override
            public String getPosition() {
                return "Automation Engineer";
            }

            @Override
            public String getSeniority() {
                return "Senior";
            }

            @Override
            public String getLastName() {
                return ("Aksani");


            }
        }

       public class ManualTestEngineer extends Employee {
           public final String LastName;

           public ManualTestEngineer(String name, String LastName) {
               super("John");
               this.LastName = LastName;
           }

           @Override
           public String getLastName() {
               return ("Smith");
           }

           @Override
           public String getPosition() {
               return "ManualTestEngineer";
           }

           @Override
           public String getSeniority() {
               return "Junior";
           }

       }

           public class Manager extends Employee{

               private final String LastName;

               public Manager(String name, String LastName){
                   super("William");
                   this.LastName=LastName;

               }
               @Override
               public String getPosition() {
                   return "Manager";
               }

               @Override
               public String getSeniority() {
                   return "Senior";
               }

               @Override
               public String getLastName() {
                   return ("Underwood");
               }

               @Override
               public String getInfo() {
                   return super.getInfo();
               }

               Employee[]team;

               public void setTeam(Employee[] team) {
                   this.team = team;
               }

               public void setTeamMembers(Employee...members){
                   team = members;

               }
           }

    }




