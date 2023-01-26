public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("David Santiago Anacona Castellanos");
        persona.setTelefono(3013744363L);

        System.out.println("La persona creada tiene de nombre "+persona.getNombre());
        System.out.println("tiene una edad de "+persona.getEdad()+" y su numero de contacto es "+persona.getTelefono());
    }

    static class Persona{
        private int edad;
        private String nombre;
        private long telefono;

        public Persona() {
        }

        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }


    }
}