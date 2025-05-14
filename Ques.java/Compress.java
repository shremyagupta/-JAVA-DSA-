public class Compress {
    public static String compresss(String str){
        String newstr = "";
        for(int i =0 ; i<str.length(); i++){
            Integer Count  =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                Count++;
                i++;
            }
            newstr += str.charAt(i);
            if(Count >1){
             newstr += Count.toString();
            }
        }
        return newstr;
    }
        public static void main(String args[]){
            String str = "aaabbccdeee";
            System.out.println(compresss(str));
        }

    }

