import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
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
import java.util.ArrayList;

public  class LatexTranslateListener extends HtmlBaseListener{

    StringBuilder sb = new StringBuilder();

    int columnCount = 0;
    List<Integer> columnCountArray = new ArrayList<>();
    String tableString = "";
    int table_border = 0;

    String link_href = "";
    String link_text = "";
    String link_name = "";

    int font_size = 4;
    String font_content = "";

    String test = "";

    CustomMethods cm = new CustomMethods();

    @Override public void enterRoot(HtmlParser.RootContext ctx) {
        sb.append("\\documentclass{article}");
        sb.append("\n");
        sb.append("\\usepackage[utf8]{inputenc}");
        sb.append("\n");
        sb.append("\\usepackage{natbib}");
        sb.append("\n");
        sb.append("\\usepackage{graphicx}");
        sb.append("\n");
        sb.append("\\usepackage{hyperref}");
        sb.append("\n");
        

        sb.append("\\begin{document}");
        
    }

    @Override public void exitRoot(HtmlParser.RootContext ctx) {
        sb.append("\n");
        sb.append("\\end{document}");
    }

    @Override public void enterP_start(HtmlParser.P_startContext ctx) { 
        sb.append("\n");
        sb.append("\\par ");
    }
 
    @Override public void exitP_start(HtmlParser.P_startContext ctx) { 
    }

    @Override public void enterP_end(HtmlParser.P_endContext ctx) { 
    }

    @Override public void exitP_end(HtmlParser.P_endContext ctx) { 
    }

    @Override public void enterText(HtmlParser.TextContext ctx) { 
        String s = ctx.getText();
        sb.append(s);
    }

    @Override public void exitText(HtmlParser.TextContext ctx) { 


    }
    @Override public void enterHtml_chardata(HtmlParser.Html_chardataContext ctx) { }
    
    @Override public void exitHtml_chardata(HtmlParser.Html_chardataContext ctx) { }

    @Override public void enterDiv_start(HtmlParser.Div_startContext ctx) { }

    @Override public void exitDiv_start(HtmlParser.Div_startContext ctx) { 
        sb.append("\n");
        sb.append("\\par ");
    }

    @Override public void enterDiv_end(HtmlParser.Div_endContext ctx) { }

    @Override public void exitDiv_end(HtmlParser.Div_endContext ctx) { }

    @Override public void enterH1_start(HtmlParser.H1_startContext ctx) { 
        sb.append("\n");
        sb.append("\\section{");
    }

    @Override public void exitH1_start(HtmlParser.H1_startContext ctx) { 
        
    }

    @Override public void enterH1_end(HtmlParser.H1_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitH1_end(HtmlParser.H1_endContext ctx) { }

    @Override public void enterH2_start(HtmlParser.H2_startContext ctx) { 
        sb.append("\n");
        sb.append("\\subsection{");
    }

    @Override public void exitH2_start(HtmlParser.H2_startContext ctx) { }

    @Override public void enterH2_end(HtmlParser.H2_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitH2_end(HtmlParser.H2_endContext ctx) { }

    @Override public void enterH3_start(HtmlParser.H3_startContext ctx) { 
        sb.append("\n");
        sb.append("\\subsubsection{");
    }

    @Override public void exitH3_start(HtmlParser.H3_startContext ctx) { }

    @Override public void enterH3_end(HtmlParser.H3_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitH3_end(HtmlParser.H3_endContext ctx) { }

    @Override public void enterH4_start(HtmlParser.H4_startContext ctx) { 
        sb.append("\n");
        sb.append("\\paragraph{");
    }

    @Override public void exitH4_start(HtmlParser.H4_startContext ctx) { }

    @Override public void enterH4_end(HtmlParser.H4_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitH4_end(HtmlParser.H4_endContext ctx) { }

    @Override public void enterCenter_start(HtmlParser.Center_startContext ctx) { 
        sb.append("\n");
        sb.append("\\begin{center}");
    }

    @Override public void exitCenter_start(HtmlParser.Center_startContext ctx) { }

    @Override public void enterCenter_end(HtmlParser.Center_endContext ctx) { 
        sb.append("\n");
        sb.append("\\end{center}");
    }

    @Override public void exitCenter_end(HtmlParser.Center_endContext ctx) { }

    @Override public void enterSmall_start(HtmlParser.Small_startContext ctx) { 
        sb.append("\n");
        sb.append("\\small{");
    }

    @Override public void exitSmall_start(HtmlParser.Small_startContext ctx) { }

    @Override public void enterSmall_end(HtmlParser.Small_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitSmall_end(HtmlParser.Small_endContext ctx) { }

    @Override public void enterStrong_start(HtmlParser.Strong_startContext ctx) { 
        sb.append("\n");
        sb.append("\\textbf{");
    }

    @Override public void exitStrong_start(HtmlParser.Strong_startContext ctx) { }

    @Override public void enterStrong_end(HtmlParser.Strong_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitStrong_end(HtmlParser.Strong_endContext ctx) { }

    @Override public void enterEm_start(HtmlParser.Em_startContext ctx) { 
        sb.append("\n");
        sb.append("\\emph{");
    }

    @Override public void exitEm_start(HtmlParser.Em_startContext ctx) { }

    @Override public void enterEm_end(HtmlParser.Em_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitEm_end(HtmlParser.Em_endContext ctx) { }

    @Override public void enterU_start(HtmlParser.U_startContext ctx) { 
        sb.append("\n");
        sb.append("\\underline{");
    }

    @Override public void exitU_start(HtmlParser.U_startContext ctx) { }

    @Override public void enterU_end(HtmlParser.U_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitU_end(HtmlParser.U_endContext ctx) { }

    @Override public void enterB_start(HtmlParser.B_startContext ctx) { 
        sb.append("\n");
        sb.append("\\textbf{");
    }

    @Override public void exitB_start(HtmlParser.B_startContext ctx) { }

    @Override public void enterB_end(HtmlParser.B_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitB_end(HtmlParser.B_endContext ctx) { }

    @Override public void enterI_start(HtmlParser.I_startContext ctx) { 
        sb.append("\n");
        sb.append("\\textit{");
    }

    @Override public void exitI_start(HtmlParser.I_startContext ctx) { }

    @Override public void enterI_end(HtmlParser.I_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitI_end(HtmlParser.I_endContext ctx) { }

    @Override public void enterSub_start(HtmlParser.Sub_startContext ctx) { 
        sb.append("\\textsubscript{");
    }

    @Override public void exitSub_start(HtmlParser.Sub_startContext ctx) { }

    @Override public void enterSub_end(HtmlParser.Sub_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitSub_end(HtmlParser.Sub_endContext ctx) { }

    @Override public void enterSup_start(HtmlParser.Sup_startContext ctx) { 
        sb.append("\\textsuperscript{");
    }

    @Override public void exitSup_start(HtmlParser.Sup_startContext ctx) { }

    @Override public void enterSup_end(HtmlParser.Sup_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitSup_end(HtmlParser.Sup_endContext ctx) { }

    @Override public void enterTt_start(HtmlParser.Tt_startContext ctx) { 
        sb.append("\n");
        sb.append("\\texttt{");
    }

    @Override public void exitTt_start(HtmlParser.Tt_startContext ctx) { }

    @Override public void enterTt_end(HtmlParser.Tt_endContext ctx) { 
        sb.append("}");
    }

    @Override public void exitTt_end(HtmlParser.Tt_endContext ctx) { }

    @Override public void enterUl_start(HtmlParser.Ul_startContext ctx) { 
        sb.append("\n");
        sb.append("\\begin{itemize}");
    }

    @Override public void exitUl_start(HtmlParser.Ul_startContext ctx) { }

    @Override public void enterUl_end(HtmlParser.Ul_endContext ctx) { 
        sb.append("\n");
        sb.append("\\end{itemize}");
    }

    @Override public void exitUl_end(HtmlParser.Ul_endContext ctx) { }

    @Override public void enterOl_start(HtmlParser.Ol_startContext ctx) { 
        sb.append("\n");
        sb.append("\\begin{enumerate}");
    }

    @Override public void exitOl_start(HtmlParser.Ol_startContext ctx) { }

    @Override public void enterOl_end(HtmlParser.Ol_endContext ctx) { 
        sb.append("\n");
        sb.append("\\end{enumerate}");
    }

    @Override public void exitOl_end(HtmlParser.Ol_endContext ctx) { }

    @Override public void enterLi_start(HtmlParser.Li_startContext ctx) { 
        sb.append("\n");
        sb.append("\\item ");
    }

    @Override public void exitLi_start(HtmlParser.Li_startContext ctx) { }

    @Override public void enterLi_end(HtmlParser.Li_endContext ctx) { }

    @Override public void exitLi_end(HtmlParser.Li_endContext ctx) { }
   

    @Override public void enterTable(HtmlParser.TableContext ctx) { 
        
    }

    @Override public void exitTable(HtmlParser.TableContext ctx) { 
        sb.append("\n\n");
        sb.append("\\begin{tabular}");
        sb.append(cm.getColumnString(columnCountArray.get(0), table_border));
        sb.append("\n");
        if(table_border>0)
            sb.append("\\hline");
        sb.append("\n");

        tableString = cm.formatTableString(tableString, table_border);

        sb.append(tableString);
        sb.append("\n");
        if(table_border>0)
            sb.append("\\hline");
        sb.append("\n");
        sb.append("\\end{tabular}");
        sb.append("\n");

        tableString = "";
        columnCount = 0;
        columnCountArray.clear();
        table_border = 0;
    }

    @Override public void enterTbody_content(HtmlParser.Tbody_contentContext ctx) { }

    @Override public void exitTbody_content(HtmlParser.Tbody_contentContext ctx) { }

    @Override public void enterTr_content(HtmlParser.Tr_contentContext ctx) { 

    }
 
    @Override public void exitTr_content(HtmlParser.Tr_contentContext ctx) { 
        if(tableString.endsWith("&"))
            tableString = tableString.substring(0, tableString.length() - 1);
        tableString+="\\\\ ";
        tableString+="\n";
        tableString+= "*\\hline*";
        tableString+="\n";
        columnCountArray.add(columnCount);
        columnCount = 0;
    }

    @Override public void enterTd_content(HtmlParser.Td_contentContext ctx) { 
        tableString+=" ";
        tableString+= ctx.getText();
        tableString+= " &";
        columnCount++;
    }

    @Override public void exitTd_content(HtmlParser.Td_contentContext ctx) { }

    @Override public void enterTable_start(HtmlParser.Table_startContext ctx) { 
        table_border = cm.getTableBorder(ctx.getText());
    }

    @Override public void exitTable_start(HtmlParser.Table_startContext ctx) { }

    @Override public void enterTable_end(HtmlParser.Table_endContext ctx) { }

    @Override public void exitTable_end(HtmlParser.Table_endContext ctx) { }

    @Override public void enterTr_start(HtmlParser.Tr_startContext ctx) { 

    }

    @Override public void exitTr_start(HtmlParser.Tr_startContext ctx) { }

    @Override public void enterTr_end(HtmlParser.Tr_endContext ctx) { 
    }

    @Override public void exitTr_end(HtmlParser.Tr_endContext ctx) { }

    @Override public void enterTd_start(HtmlParser.Td_startContext ctx) { }

    @Override public void exitTd_start(HtmlParser.Td_startContext ctx) { }

    @Override public void enterTd_end(HtmlParser.Td_endContext ctx) { }

    @Override public void exitTd_end(HtmlParser.Td_endContext ctx) { }

    @Override public void enterA_link(HtmlParser.A_linkContext ctx) { }

    @Override public void exitA_link(HtmlParser.A_linkContext ctx) { 
        sb.append("\n");
        if(link_href!=""){
            if(link_href.charAt(0)=='#'){
                sb.append("\\hyperref[");
                sb.append(link_href.substring(1));
                sb.append("]");
                sb.append("{");
                sb.append("link_text");
                sb.append("} ");
            }else{
                sb.append("\\href{");
                sb.append(link_href);
                sb.append("}");

                sb.append("{");
                sb.append(link_text);
                sb.append("} ");
            }
            
        }
        if(link_name!=""){
            sb.append("\\label{");
            sb.append(link_name);
            sb.append("}");
        }
        link_text = "";
        link_href = "";
        link_name = "";
    }

    @Override public void enterA_content(HtmlParser.A_contentContext ctx) { 
        link_text = ctx.getText();
    }

    @Override public void exitA_content(HtmlParser.A_contentContext ctx) { }
    
    @Override public void enterA_start(HtmlParser.A_startContext ctx) { 
        link_href = cm.getHrefFromTag(ctx.getText());
        link_name = cm.getNameFromTag(ctx.getText());
    }

    @Override public void exitA_start(HtmlParser.A_startContext ctx) { }
 
    @Override public void enterA_end(HtmlParser.A_endContext ctx) { }

    @Override public void exitA_end(HtmlParser.A_endContext ctx) { }

    @Override public void enterBr(HtmlParser.BrContext ctx) { 
        sb.append("\n");
        sb.append("\\newline");
    }

    @Override public void exitBr(HtmlParser.BrContext ctx) { }

    @Override public void enterFont(HtmlParser.FontContext ctx) { }

    @Override public void exitFont(HtmlParser.FontContext ctx) { 
        
        sb.append("\n");
        sb.append("{");
        sb.append(cm.getLatexFont(font_size));
        sb.append(" ");
        sb.append(font_content);
        sb.append("}");
        font_content = "";
        font_size = 4;
    }

    @Override public void enterFont_content(HtmlParser.Font_contentContext ctx) { 
        font_content = ctx.getText();
    }

    @Override public void exitFont_content(HtmlParser.Font_contentContext ctx) { }

    @Override public void enterFont_start(HtmlParser.Font_startContext ctx) { 
        font_size = cm.getFontSizeFromTag(ctx.getText());
    }
    @Override public void enterImg(HtmlParser.ImgContext ctx) { 

        sb.append("\n");
        sb.append("\\begin{figure}[h]");
        sb.append("\n");
        sb.append("\\includegraphics");
        int w = cm.getImgWidth(ctx.getText());
        int h = cm.getImgHeight(ctx.getText());
        int w_cm = w/10 + 1;
        int h_cm = h/10 + 1;
        String src = cm.getImgSrc(ctx.getText());
        if(w == -1 && h == -1){

        }else if(w == -1 && h!= -1){
            sb.append("[height=");
            sb.append(h_cm);
            sb.append("cm");
            sb.append("]");
        }else if(w!= -1 && h == -1){
            sb.append("[width=");
            sb.append(w_cm);
            sb.append("cm");
            sb.append("]");
        }else{
            sb.append("[width=");
            sb.append(w_cm);
            sb.append("cm ");
            sb.append("height=");
            sb.append(w_cm);
             sb.append("cm");
            sb.append("]");
        }
        sb.append("{");
        sb.append(src);
        sb.append("}");
        sb.append("\n");
        sb.append("\\end{figure}");
    }

    @Override public void exitImg(HtmlParser.ImgContext ctx) { }

    @Override public void enterDl_start(HtmlParser.Dl_startContext ctx) { 
        sb.append("\n");
        sb.append("\\begin{description}");
    }

    @Override public void exitDl_start(HtmlParser.Dl_startContext ctx) { }

    @Override public void enterDl_end(HtmlParser.Dl_endContext ctx) { 
        sb.append("\n");
        sb.append("\\end{description}");
    }
 
    @Override public void exitDl_end(HtmlParser.Dl_endContext ctx) { }

    @Override public void enterDt_start(HtmlParser.Dt_startContext ctx) { 
        sb.append("\n");
        sb.append("\\item ");
    }

    @Override public void exitDt_start(HtmlParser.Dt_startContext ctx) { }

    @Override public void enterDt_end(HtmlParser.Dt_endContext ctx) { }

    @Override public void exitDt_end(HtmlParser.Dt_endContext ctx) { }
  
    @Override public void enterDd_start(HtmlParser.Dd_startContext ctx) { 
        sb.append("\n");
        sb.append("\\item \\hspace{0.5cm}");
    }
 
    @Override public void exitDd_start(HtmlParser.Dd_startContext ctx) { }
 
    @Override public void enterDd_end(HtmlParser.Dd_endContext ctx) { }

    @Override public void exitDd_end(HtmlParser.Dd_endContext ctx) { }

    @Override public void enterHtml_latex_char(HtmlParser.Html_latex_charContext ctx) { 
        if(ctx.getText().charAt(0)=='\\'){
            sb.append("{\\textbackslash}");
        }else{
            sb.append("\\");
            sb.append(ctx.getText());
        }
        
    }
    @Override public void enterGreek_text(HtmlParser.Greek_textContext ctx) { 
        String s = ctx.getText();
        s = s.substring(1, s.length()-1);
        s = "\\"+s;
        sb.append(s);
    }


}