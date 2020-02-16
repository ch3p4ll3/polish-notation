import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        String espressione = "";
        int x, y;
        Pila p = new Pila();
        String[] exp;

        try {
            System.out.print("Inserisci un'espressione: ");
            espressione = tastiera.readLine();
        }
        catch (Exception e){
            System.exit(0);
        }

        exp = espressione.split(" ");

        if (Character.isDigit(exp[0].toCharArray()[0])) {
            for (int i = 0; i < exp.length; i++) {
                if (!exp[i].equals("*") && !exp[i].equals("/") && !exp[i].equals("+") && !exp[i].equals("-")) {
                    try {
                        p.push(Integer.parseInt(exp[i]));
                    } catch (Exception e) {
                        System.out.println("Char: " + exp[i] + "Position: " + i);
                        System.out.println("Errore, hai inserito un carattere non valido");
                        System.exit(0);
                    }
                } else {
                    switch (exp[i]) {
                        case "*":
                            x = p.pop();
                            y = p.pop();
                            p.push(y * x);
                            break;

                        case "/":
                            x = p.pop();
                            y = p.pop();
                            p.push(y / x);
                            break;

                        case "+":
                            x = p.pop();
                            y = p.pop();
                            p.push(y + x);
                            break;

                        case "-":
                            x = p.pop();
                            y = p.pop();
                            p.push(y - x);
                            break;
                    }
                }
            }
        }

        else {
            for (int i = exp.length-1; i >= 0; i--) {
                if (!exp[i].equals("*") && !exp[i].equals("/") && !exp[i].equals("+") && !exp[i].equals("-")) {
                    try {
                        p.push(Integer.parseInt(exp[i]));
                    } catch (Exception e) {
                        System.out.println(exp[i]);
                        System.out.println("Errore, hai inserito un carattere non valido");
                        System.exit(0);
                    }
                } else {
                    switch (exp[i]) {
                        case "*":
                            x = p.pop();
                            y = p.pop();
                            p.push(x * y);
                            break;

                        case "/":
                            x = p.pop();
                            y = p.pop();
                            p.push(x / y);
                            break;

                        case "+":
                            x = p.pop();
                            y = p.pop();
                            p.push(x + y);
                            break;

                        case "-":
                            x = p.pop();
                            y = p.pop();
                            p.push(x - y);
                            break;
                    }
                }
            }
        }

        while (!p.isEmpty()){
            System.out.println(p.pop());
        }
    }
}
