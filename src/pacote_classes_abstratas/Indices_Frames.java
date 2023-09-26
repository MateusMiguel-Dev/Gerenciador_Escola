package pacote_classes_abstratas;

public class Indices_Frames {
        private static String valor;
        private static String Cod_TecAdmin;
        private static String Cod_Professor;

        public static String getCod_TecAdmin() {
            return Cod_TecAdmin;
        }

        public static void setCod_TecAdmin(String Cod_TecAdmin) {
            Indices_Frames.Cod_TecAdmin = Cod_TecAdmin;
        }

        public static String getCod_Professor() {
            return Cod_Professor;
        }

        public static void setCod_Professor(String Cod_Professor) {
            Indices_Frames.Cod_Professor = Cod_Professor;
        }
        
        public static String getValor() {
            return valor;
        }

        public static void setValor(String novoValor) {
        valor = novoValor;
    }
}
