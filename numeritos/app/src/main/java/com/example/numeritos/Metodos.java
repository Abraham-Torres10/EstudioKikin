package com.example.numeritos;

public class Metodos {
    String unidades[] = {"", "uno", "dos", "tres", "cuatro", "cinco",
            "seis", "siete", "ocho", "nueve", "diez"};
    String decenas[] = {"", "diez", "veinte", "treinta", "cuarenta",
            "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    String centenas[] = {"", "cien", "doscientos", "trescientos", "cuatrocientos",
            "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    String cienes = "to";
    String miles = "mil";

    String veintes[] = {"", "veintiuno", "veintidos", "veintitres", "veinticuatro",
            "veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve"};

    String dieces[] = {"", "once", "doce", "trece", "catorce",
            "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};

    public String unacifra(int numero) {
        if (numero == 0)
            return "cero";
        else
            return unidades[numero];
    }

    public String doscifras(String textote) {

        int decenita = Integer.parseInt(textote.substring(0, 1));
        int unidadcita = Integer.parseInt(textote.substring(1, 2));

        if (unidadcita == 0)
            return decenas[decenita];
        else {
            if (Integer.parseInt(textote) > 20 && Integer.parseInt(textote) <= 30)
                return veintes[unidadcita];
            else if (Integer.parseInt(textote) < 20 && Integer.parseInt(textote) >= 11)
                return dieces[unidadcita];
            else
                return decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String trescifras(String textote) {

        int centenita = Integer.parseInt(textote.substring(0, 1));
        int decenita = Integer.parseInt(textote.substring(1, 2));
        int unidadcita = Integer.parseInt(textote.substring(2, 3));

        if (unidadcita == 0 && decenita == 0)
            return centenas[centenita];
        else {
            if (centenita==1){
            if (Integer.parseInt(textote.substring(1, 3)) > 20 && Integer.parseInt(textote.substring(1, 3)) < 30)
                return centenas[centenita] + cienes + " " + veintes[unidadcita];
            else if (Integer.parseInt(textote.substring(1, 3)) < 20 && Integer.parseInt(textote.substring(1, 3)) >= 11)
                return centenas[centenita] + cienes + " " + dieces[unidadcita];
            else if (decenita == 0)
                return centenas[centenita] + cienes + " " + unidades[unidadcita];
            else if (unidadcita == 0)
                return centenas[centenita] + cienes + " " + decenas[decenita];
            else
                return centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
            }else {
                if (Integer.parseInt(textote.substring(1, 3)) > 20 && Integer.parseInt(textote.substring(1, 3)) < 30)
                    return centenas[centenita] + " " + veintes[unidadcita];
                else if (Integer.parseInt(textote.substring(1, 3)) < 20 && Integer.parseInt(textote.substring(1, 3)) >= 11)
                    return centenas[centenita] + " " + dieces[unidadcita];
                else if (decenita == 0)
                    return centenas[centenita] + " " + unidades[unidadcita];
                else if (unidadcita == 0)
                    return centenas[centenita] + " " + decenas[decenita];
                else
                    return centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
            }
        }
    }

    public String cuatrocifras(String textote) {

        int mil1 = Integer.parseInt(textote.substring(0, 1));
        int centenita = Integer.parseInt(textote.substring(1, 2));
        int decenita = Integer.parseInt(textote.substring(2, 3));
        int unidadcita = Integer.parseInt(textote.substring(3, 4));

        if (centenita == 0 && decenita == 0 && unidadcita == 0) {
            if (mil1 == 1) {
                return miles;
            } else {
                return unidades[mil1] + " " + miles;
            }
        } else {
            if (mil1 == 1) {
                if (centenita == 0) {
                    if (decenita == 0) {
                        return miles + " " + unidades[unidadcita];
                    } else if (unidadcita == 0) {
                        return miles + " " + decenas[decenita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return miles + " " + veintes[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return miles + " " + dieces[unidadcita];
                    } else {
                        return miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
                    }
                }
                if (centenita == 1) {
                    if (decenita == 0 && unidadcita == 0) {
                        return miles + " " + centenas[centenita];
                    } else if (decenita == 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + unidades[unidadcita];
                    } else if (unidadcita == 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + veintes[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                    } else {
                        return miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
                    }
                } else {
                    if (decenita == 0 && unidadcita == 0) {
                        return miles + " " + centenas[centenita];
                    } else if (decenita == 0) {
                        return miles + " " + centenas[centenita] + " " + unidades[unidadcita];
                    } else if (unidadcita == 0) {
                        return miles + " " + centenas[centenita] + " " + decenas[decenita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + " " + veintes[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                    } else {
                        return miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
                    }
                }
            } else {
                if (centenita == 0) {
                    if (decenita == 0) {
                        return unidades[mil1] + " " + miles + " " + unidades[unidadcita];
                    } else if (unidadcita == 0) {
                        return unidades[mil1] + " " + miles + " " + decenas[decenita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return unidades[mil1] + " " + miles + " " + veintes[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return unidades[mil1] + " " + miles + " " + dieces[unidadcita];
                    } else {
                        return unidades[mil1] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
                    }
                }
                if (centenita == 1) {
                    if (decenita == 0 && unidadcita == 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita];
                    } else if (decenita == 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + unidades[unidadcita];
                    } else if (unidadcita == 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + veintes[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                    } else {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
                    }
                } else {
                    if (decenita == 0 && unidadcita == 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita];
                    } else if (decenita == 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + " " + unidades[unidadcita];
                    } else if (unidadcita == 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + " " + veintes[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                    } else {
                        return unidades[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
                    }
                }
            }
        }
    }

    public String cincocifras(String textote) {

        int mil1 = Integer.parseInt(textote.substring(0, 1));
        int mil2 = Integer.parseInt(textote.substring(1, 2));
        int centenita = Integer.parseInt(textote.substring(2, 3));
        int decenita = Integer.parseInt(textote.substring(3, 4));
        int unidadcita = Integer.parseInt(textote.substring(4, 5));
        Auxiliares metodo5 = new Auxiliares();

        if (mil2 == 0 && centenita == 0 && decenita == 0 && unidadcita == 0) {
            return decenas[mil1] + " " + miles;
        }else if (mil1 == 1) {
            if (mil2 == 0) {
                return metodo5.mil2es0(textote);
            } else {
                if (mil2>0){
                    return dieces[mil2] + " " + miles + " " + metodo5.excepmet5(textote);
                }else
                    return metodo5.diecesmet5(textote);
            }
        } else if (mil1 == 2) {
            if (mil2 == 0) {
                return metodo5.mil2es0(textote);
            } else {
                if (mil2==1 && decenita==2)
                    return "veintiún " + miles + " " + metodo5.excepmet5(textote);
                else if (mil2==1 && decenita==1) {
                    return "veintiún " + miles + " " + metodo5.excepmet5(textote);
                } else if (mil2==1){
                    return "veintiún " + miles + " " + metodo5.excepmet5(textote);
                }else
                return metodo5.veintesmet5(textote);
            }
        }else {
            if (mil2==1) {
                return decenas[mil1] + " y un "  + miles + " " + metodo5.excepmet5(textote);
            } else
            return metodo5.mil2random(textote);
        }
    }

    public String seiscifras(String textote) {

        int mil3 = Integer.parseInt(textote.substring(0, 1));
        int mil1 = Integer.parseInt(textote.substring(1, 2));
        int mil2 = Integer.parseInt(textote.substring(2, 3));
        int centenita = Integer.parseInt(textote.substring(3, 4));
        int decenita = Integer.parseInt(textote.substring(4, 5));
        int unidadcita = Integer.parseInt(textote.substring(5, 6));
        Auxiliares metodo6 = new Auxiliares();

        if (mil1 == 0 && mil2 == 0 && centenita == 0 && unidadcita == 0 && decenita == 0) {
            return centenas[mil3] + " " + miles;
        } else if (mil1 == 0 && mil2 == 0) {
                return centenas[mil3] + " " + miles + " " + metodo6.excepmet6(textote);
        } else if (mil1 == 0 && mil2 == 1) {
                if (centenita == 0 && unidadcita == 0 && decenita == 0)
                    return centenas[mil3] + cienes + " un " + miles;
                else
                    return centenas[mil3] + cienes + " un "+ miles + " " + metodo6.excepmet6(textote);
            } else if (mil1 == 0 && mil2 > 1) {
                if (mil3==1) {
                    if (centenita == 0 && unidadcita == 0 && decenita == 0)
                        return centenas[mil3] + cienes + " " + unidades[mil2] + " " + miles;
                    else
                        return centenas[mil3] + cienes + " " + unidades[mil2] + " " + miles + " " + metodo6.excepmet6(textote);
                }else {
                    if (centenita == 0 && unidadcita == 0 && decenita == 0)
                        return centenas[mil3] + " " + unidades[mil2] + " " + miles;
                    else
                        return centenas[mil3] + " " + unidades[mil2] + " " + miles + " " + metodo6.excepmet6(textote);
                }
            }
           else if (mil3 == 1) {
            if (mil1==2 && mil2==1 && decenita==2) {
                return centenas[mil3] + cienes + " veintiún " + metodo6.veintesmet6(textote);
            }
            else if (mil1==2 && mil2==1 && decenita==1) {
                return centenas[mil3] + cienes + " veintiún mil " + metodo6.excepmet6(textote);
            } else if (mil1==2 && mil2==1){
                return centenas[mil3] + cienes + " veintiún " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==2 && mil2>1){
                return centenas[mil3] + cienes + " " + veintes[mil2] + " " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==1 && mil2==0){
                return centenas[mil3] + cienes + " " + decenas[mil1] + " " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==1 && mil2>0){
                return centenas[mil3] + cienes + " " + dieces[mil2] + " " + miles + " " + metodo6.excepmet6(textote);
            } else if (mil1==2 && mil2==0 && decenita==1) {
                return centenas[mil3] + cienes + " veinte " + miles + " " +metodo6.excepmet6(textote);
            }else if (mil1==2 && mil2==0 && decenita==2) {
                return centenas[mil3] +  cienes + " veinte mil " + metodo6.veintesmet6(textote);
            }else if (mil1==2 && mil2==0) {
                return centenas[mil3] +  cienes + " veinte " + miles + " " + metodo6.excepmet6(textote);
            } else if (mil2==1){
                return centenas[mil3] + cienes + " " + decenas[mil1] + " y un " + miles + " " + metodo6.excepmet6(textote);
            }else
            return centenas[mil3] + cienes + " " + metodo6.cienmilesmet6(textote);
            }
            else{
            if (mil1==2 && mil2==1 && decenita==2)
                return centenas[mil3] + " veintiún " + metodo6.veintesmet6(textote);
            else if (mil1==2 && mil2==1 && decenita==1) {
                return centenas[mil3] +  " veintiún " + metodo6.excepmet6(textote);
            } else if (mil1==2 && mil2==0 && decenita==1) {
                return centenas[mil3] +  " veinte " + metodo6.excepmet6(textote);
            }else if (mil1==2 && mil2==0 && decenita==2) {
                return centenas[mil3] +  " veinte " + metodo6.veintesmet6(textote);
            }else if (mil1==2 && mil2==1){
                return centenas[mil3] + " veintiún " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==2 && mil2>1){
                return centenas[mil3] + " " + veintes[mil2] + " " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==0 && mil2==0){
                return centenas[mil3] + " " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==1 && mil2==0){
                return centenas[mil3] + " " + decenas[mil1] + " " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==1 && mil2>0){
                return centenas[mil3] + " " + dieces[mil2] + " " + miles + " " + metodo6.excepmet6(textote);
            }else if (mil1==2 && mil2==0) {
                return centenas[mil3] +  " veinte " + miles + " " + metodo6.excepmet6(textote);
            } else if (mil2==1){
                return centenas[mil3] + " "+ decenas[mil1] + " y un " + miles + " " + metodo6.excepmet6(textote);
            }
            return  centenas[mil3] + " "+ metodo6.cienmilesmet6(textote);
        }
    }
}
