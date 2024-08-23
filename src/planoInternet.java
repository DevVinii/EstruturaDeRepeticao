public class planoInternet {

    public static void main(String[] args) {
        
        String plano = "ótimo";
        String beneficioUm = "Whatsapp";
        String beneficioDois = "TikTok";

        switch(plano){

            case "normal":{
                System.out.println("Plano comum");
                break;
            }

            case "medio":{
                System.out.print("Plano medio acompanha: " + beneficioUm);
                break;
            }

            case "ótimo":{
                System.out.println("Beneficio bom acompanha: " + beneficioUm + " " + "e " + beneficioDois);
                break;
            }
            default:{
                System.out.println("Valor indefinido");
            }
        }

    }
    
}
