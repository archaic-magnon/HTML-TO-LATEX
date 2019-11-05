import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMethods {

        // return table string for column
        public String getColumnString(int columnCount, int tableBorder){
            String s = "";
            if(tableBorder>0)
                s+= "{ |";
            else
                s+= "{ ";
            for(int i = 0; i < columnCount; i++){
                if(tableBorder>0)
                    s+= "c|";
                else
                    s+= "c";
            }
            s+= " }";
            return s;
        }

        // return border value from table tag
        public int getTableBorder(String s){
            s = s.toLowerCase();
            int border = 0;
            if(s.contains("border")){
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(s);
                if(m.find()){
                    border = Integer.parseInt(m.group());
                }
            }
            return border;
        }

        // return formatted table String
        public String formatTableString(String s, int tableBorder){
            if(tableBorder>0)
                return s.replace("*\\hline*", "\\hline");
            else
                return s.replace("*\\hline*", "");
            
        }

        // return href link from a tag
        public String getHrefFromTag(String s){
            s = s.toLowerCase();
            s = s.replaceAll("\\s","");
            s = s.replaceAll("'","\"");

            Pattern p = Pattern.compile("href=\"(.*?)\"", Pattern.DOTALL);
            Matcher m = p.matcher(s);

            if (m.find()) 
            {
                String result = m.group();
                return result.substring(6, result.length()-1);

            }
            else
                return "";
        }

        // return name value from a tag
        public String getNameFromTag(String s){
            s = s.toLowerCase();
            s = s.replaceAll("\\s","");
            s = s.replaceAll("'","\"");

            Pattern p = Pattern.compile("name=\"(.*?)\"", Pattern.DOTALL);
            Matcher m = p.matcher(s);

            if (m.find()) 
            {
                String result = m.group();
                return result.substring(6, result.length()-1);

            }
            else
                return "";
        }
        
        // return corresponding latex font
        public String getLatexFont(int size){
            switch(size){
                case 1:
                    return("\\scriptsize");
                case 2:
                    return("\\footnotesize");
                case 3:
                    return("\\small");
                case 4:
                    return("\\normalsize");
                case 5:
                    return("\\Large");
                case 6:
                    return("\\LARGE");
                case 7:
                    return("\\huge");
                default:
                    return("\\huge");

            }
        }

        // return font size from font tag
        public int getFontSizeFromTag(String s){
            s = s.toLowerCase();
            int size = 4;
            if(s.contains("size")){
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(s);
                if(m.find()){
                    size = Integer.parseInt(m.group());
                }
            }
            return size;

        }

        // return img src from image tag
        public String getImgSrc(String s){
            s = s.toLowerCase();
            s = s.replaceAll("\\s","");
            s = s.replaceAll("'","\"");
            String src = "";

            if(s.contains("src")){
                Pattern p = Pattern.compile("src=\"(.*?)\"", Pattern.DOTALL);
                Matcher m = p.matcher(s);

                if (m.find()) {
                    src = m.group();
                    return src.substring(5, src.length()-1);
                }
            }
            return src;
        }

        // return width of image
        public int getImgWidth(String s){
            s = s.toLowerCase();
            s = s.replaceAll("\\s","");
            s = s.replaceAll("'","\"");
            int width = -1;

            if(s.contains("width")){
                Pattern p = Pattern.compile("width=(\".*?\")", Pattern.DOTALL);
                Matcher m = p.matcher(s);
                if (m.find()) {
                    String result = m.group();
                    System.out.println(result);
                    Pattern p_int = Pattern.compile("\\d+");
                    Matcher m_int = p_int.matcher(result);
                    if(m_int.find()){
                        return Integer.parseInt(m_int.group());
                    }  
                }
            }
            return width;
        }

        // return height of image
        public int getImgHeight(String s){
            s = s.toLowerCase();
            s = s.replaceAll("\\s","");
            s = s.replaceAll("'","\"");
            int height = -1;

            if(s.contains("height")){
                Pattern p = Pattern.compile("height=(\".*?\")", Pattern.DOTALL);
                Matcher m = p.matcher(s);
                if (m.find()) {
                    String result = m.group();
                    System.out.println(result);
                    Pattern p_int = Pattern.compile("\\d+");
                    Matcher m_int = p_int.matcher(result);
                    if(m_int.find()){
                        return Integer.parseInt(m_int.group());
                    }  
                }
            }
            return height;
        }


        //---------------------------------------------------------------------------------------------------------------

}