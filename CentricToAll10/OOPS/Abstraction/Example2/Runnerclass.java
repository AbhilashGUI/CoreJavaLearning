package CentricToAll10.OOPS.Abstraction.Example2;

public class Runnerclass {

    public static void main(String[] args) {

        Father father= new Father() {
            @Override
            void debt10cr() {

            }
        };
        //father.ownaproperty();
        //father.debt10cr();

        Elderson elderson=new Elderson();
        elderson.ownaproperty();
        elderson.debt10cr();

        Youngerson youngerson=new Youngerson();
        youngerson.ownaproperty();
        youngerson.debt10cr();

            }
        }

