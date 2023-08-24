package TP_3.Ejercicio1;

public class Encuesta {

        private Empleado empleado;
        private Persona encuestado;
        private Formulario formulario;
        private FormularioRespondido formularioRespondido;


        public Encuesta(Empleado empleado,Persona encuestado,Formulario formulario,FormularioRespondido formularioRespondido){

                if(formularioRespondido.getDni()==encuestado.getDni() && formularioRespondido.getIdFormulario()== formulario.getIdFormulario()){
                        this.setEmpleado(empleado);
                        this.setEncuestado(encuestado);
                        this.setFormulario(formulario);
                        this.setFormularioRespondido(formularioRespondido);
                }else{
                        System.out.println("formulario y formulario respondido deben estar compuestos por el mismo encuestado");
                }


        }

        public void agregarFormulario(Formulario formulario){
               this.formulario=formulario;
        }

        public void setFormulario(Formulario formulario) {
                this.formulario = formulario;
        }

        public Formulario getFormulario() {
                return formulario;
        }

        public FormularioRespondido getFormularioRespondido() {
                return formularioRespondido;
        }

        public void setFormularioRespondido(FormularioRespondido formularioRespondido) {
                this.formularioRespondido = formularioRespondido;
        }

        public Empleado getEmpleado() {
                return empleado;
        }

        public void setEmpleado(Empleado empleado) {
                this.empleado = empleado;
        }

        public Persona getEncuestado() {
                return encuestado;
        }

        public void setEncuestado(Persona encuestado) {
                this.encuestado = encuestado;
        }
}
