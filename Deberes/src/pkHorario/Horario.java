package pkHorario;

    public class Horario {
        private String nombre;
        private String id;
        String horario [][] = new String [7][7];
    
        public Horario (){
            horario[0][0] = ("Horas");
            horario[0][1] = ("Lunes");
            horario[0][2] = ("Martes");
            horario[0][3] = ("Miercoles");
            horario[0][4] = ("Jueves");
            horario[0][5] = ("Viernes");
            horario[0][6] = ("Sabado");
            horario[1][0] = ("7-9");
            horario[2][0] = ("9-11");
            horario[3][0] = ("11-13");
            horario[4][0] = ("13-14");
            horario[5][0] = ("14-16");
            horario[6][0] = ("16-18");
        }

        public Horario ( String nombre, String id) {
            this.nombre = nombre;
            this.id = id;
            
        }
        
        public void mostrar (){
            for (int i = 0; i <horario.length; i++){
                for (int j = 0; j < horario.length; j++){
                    System.out.print(String.format("%.6s",horario [i][j]));
                    System.out.print("\t");
                }
                System.out.println();
            }
        }

        public void presentarse () 
     {
        System.out.println("-----------------------------");
        System.out.println("Nombre : " + nombre);
        System.out.println("Codigo unico : " + id);
     }
    }






