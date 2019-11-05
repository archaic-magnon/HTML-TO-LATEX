// Generated from Html.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(HtmlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(HtmlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_content}.
	 * @param ctx the parse tree
	 */
	void enterHtml_content(HtmlParser.Html_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_content}.
	 * @param ctx the parse tree
	 */
	void exitHtml_content(HtmlParser.Html_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#head_content}.
	 * @param ctx the parse tree
	 */
	void enterHead_content(HtmlParser.Head_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#head_content}.
	 * @param ctx the parse tree
	 */
	void exitHead_content(HtmlParser.Head_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#title_content}.
	 * @param ctx the parse tree
	 */
	void enterTitle_content(HtmlParser.Title_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#title_content}.
	 * @param ctx the parse tree
	 */
	void exitTitle_content(HtmlParser.Title_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HtmlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HtmlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#body_content}.
	 * @param ctx the parse tree
	 */
	void enterBody_content(HtmlParser.Body_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#body_content}.
	 * @param ctx the parse tree
	 */
	void exitBody_content(HtmlParser.Body_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#general_content}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_content(HtmlParser.General_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#general_content}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_content(HtmlParser.General_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#special_content}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_content(HtmlParser.Special_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#special_content}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_content(HtmlParser.Special_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tag_open}.
	 * @param ctx the parse tree
	 */
	void enterTag_open(HtmlParser.Tag_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tag_open}.
	 * @param ctx the parse tree
	 */
	void exitTag_open(HtmlParser.Tag_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tag_close}.
	 * @param ctx the parse tree
	 */
	void enterTag_close(HtmlParser.Tag_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tag_close}.
	 * @param ctx the parse tree
	 */
	void exitTag_close(HtmlParser.Tag_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(HtmlParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(HtmlParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(HtmlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(HtmlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tbody_content}.
	 * @param ctx the parse tree
	 */
	void enterTbody_content(HtmlParser.Tbody_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tbody_content}.
	 * @param ctx the parse tree
	 */
	void exitTbody_content(HtmlParser.Tbody_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tr_content}.
	 * @param ctx the parse tree
	 */
	void enterTr_content(HtmlParser.Tr_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tr_content}.
	 * @param ctx the parse tree
	 */
	void exitTr_content(HtmlParser.Tr_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#td_content}.
	 * @param ctx the parse tree
	 */
	void enterTd_content(HtmlParser.Td_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#td_content}.
	 * @param ctx the parse tree
	 */
	void exitTd_content(HtmlParser.Td_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#a_link}.
	 * @param ctx the parse tree
	 */
	void enterA_link(HtmlParser.A_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#a_link}.
	 * @param ctx the parse tree
	 */
	void exitA_link(HtmlParser.A_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#a_content}.
	 * @param ctx the parse tree
	 */
	void enterA_content(HtmlParser.A_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#a_content}.
	 * @param ctx the parse tree
	 */
	void exitA_content(HtmlParser.A_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#font}.
	 * @param ctx the parse tree
	 */
	void enterFont(HtmlParser.FontContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#font}.
	 * @param ctx the parse tree
	 */
	void exitFont(HtmlParser.FontContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#font_content}.
	 * @param ctx the parse tree
	 */
	void enterFont_content(HtmlParser.Font_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#font_content}.
	 * @param ctx the parse tree
	 */
	void exitFont_content(HtmlParser.Font_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_chardata}.
	 * @param ctx the parse tree
	 */
	void enterHtml_chardata(HtmlParser.Html_chardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_chardata}.
	 * @param ctx the parse tree
	 */
	void exitHtml_chardata(HtmlParser.Html_chardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_latex_char}.
	 * @param ctx the parse tree
	 */
	void enterHtml_latex_char(HtmlParser.Html_latex_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_latex_char}.
	 * @param ctx the parse tree
	 */
	void exitHtml_latex_char(HtmlParser.Html_latex_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#greek_text}.
	 * @param ctx the parse tree
	 */
	void enterGreek_text(HtmlParser.Greek_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#greek_text}.
	 * @param ctx the parse tree
	 */
	void exitGreek_text(HtmlParser.Greek_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_comment}.
	 * @param ctx the parse tree
	 */
	void enterHtml_comment(HtmlParser.Html_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_comment}.
	 * @param ctx the parse tree
	 */
	void exitHtml_comment(HtmlParser.Html_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_start}.
	 * @param ctx the parse tree
	 */
	void enterHtml_start(HtmlParser.Html_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_start}.
	 * @param ctx the parse tree
	 */
	void exitHtml_start(HtmlParser.Html_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#html_end}.
	 * @param ctx the parse tree
	 */
	void enterHtml_end(HtmlParser.Html_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#html_end}.
	 * @param ctx the parse tree
	 */
	void exitHtml_end(HtmlParser.Html_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#head_start}.
	 * @param ctx the parse tree
	 */
	void enterHead_start(HtmlParser.Head_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#head_start}.
	 * @param ctx the parse tree
	 */
	void exitHead_start(HtmlParser.Head_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#head_end}.
	 * @param ctx the parse tree
	 */
	void enterHead_end(HtmlParser.Head_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#head_end}.
	 * @param ctx the parse tree
	 */
	void exitHead_end(HtmlParser.Head_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#title_start}.
	 * @param ctx the parse tree
	 */
	void enterTitle_start(HtmlParser.Title_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#title_start}.
	 * @param ctx the parse tree
	 */
	void exitTitle_start(HtmlParser.Title_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#title_end}.
	 * @param ctx the parse tree
	 */
	void enterTitle_end(HtmlParser.Title_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#title_end}.
	 * @param ctx the parse tree
	 */
	void exitTitle_end(HtmlParser.Title_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#body_start}.
	 * @param ctx the parse tree
	 */
	void enterBody_start(HtmlParser.Body_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#body_start}.
	 * @param ctx the parse tree
	 */
	void exitBody_start(HtmlParser.Body_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#body_end}.
	 * @param ctx the parse tree
	 */
	void enterBody_end(HtmlParser.Body_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#body_end}.
	 * @param ctx the parse tree
	 */
	void exitBody_end(HtmlParser.Body_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#p_start}.
	 * @param ctx the parse tree
	 */
	void enterP_start(HtmlParser.P_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#p_start}.
	 * @param ctx the parse tree
	 */
	void exitP_start(HtmlParser.P_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#p_end}.
	 * @param ctx the parse tree
	 */
	void enterP_end(HtmlParser.P_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#p_end}.
	 * @param ctx the parse tree
	 */
	void exitP_end(HtmlParser.P_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#div_start}.
	 * @param ctx the parse tree
	 */
	void enterDiv_start(HtmlParser.Div_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#div_start}.
	 * @param ctx the parse tree
	 */
	void exitDiv_start(HtmlParser.Div_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#div_end}.
	 * @param ctx the parse tree
	 */
	void enterDiv_end(HtmlParser.Div_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#div_end}.
	 * @param ctx the parse tree
	 */
	void exitDiv_end(HtmlParser.Div_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h1_start}.
	 * @param ctx the parse tree
	 */
	void enterH1_start(HtmlParser.H1_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h1_start}.
	 * @param ctx the parse tree
	 */
	void exitH1_start(HtmlParser.H1_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h1_end}.
	 * @param ctx the parse tree
	 */
	void enterH1_end(HtmlParser.H1_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h1_end}.
	 * @param ctx the parse tree
	 */
	void exitH1_end(HtmlParser.H1_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h2_start}.
	 * @param ctx the parse tree
	 */
	void enterH2_start(HtmlParser.H2_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h2_start}.
	 * @param ctx the parse tree
	 */
	void exitH2_start(HtmlParser.H2_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h2_end}.
	 * @param ctx the parse tree
	 */
	void enterH2_end(HtmlParser.H2_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h2_end}.
	 * @param ctx the parse tree
	 */
	void exitH2_end(HtmlParser.H2_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h3_start}.
	 * @param ctx the parse tree
	 */
	void enterH3_start(HtmlParser.H3_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h3_start}.
	 * @param ctx the parse tree
	 */
	void exitH3_start(HtmlParser.H3_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h3_end}.
	 * @param ctx the parse tree
	 */
	void enterH3_end(HtmlParser.H3_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h3_end}.
	 * @param ctx the parse tree
	 */
	void exitH3_end(HtmlParser.H3_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h4_start}.
	 * @param ctx the parse tree
	 */
	void enterH4_start(HtmlParser.H4_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h4_start}.
	 * @param ctx the parse tree
	 */
	void exitH4_start(HtmlParser.H4_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#h4_end}.
	 * @param ctx the parse tree
	 */
	void enterH4_end(HtmlParser.H4_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#h4_end}.
	 * @param ctx the parse tree
	 */
	void exitH4_end(HtmlParser.H4_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#center_start}.
	 * @param ctx the parse tree
	 */
	void enterCenter_start(HtmlParser.Center_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#center_start}.
	 * @param ctx the parse tree
	 */
	void exitCenter_start(HtmlParser.Center_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#center_end}.
	 * @param ctx the parse tree
	 */
	void enterCenter_end(HtmlParser.Center_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#center_end}.
	 * @param ctx the parse tree
	 */
	void exitCenter_end(HtmlParser.Center_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#small_start}.
	 * @param ctx the parse tree
	 */
	void enterSmall_start(HtmlParser.Small_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#small_start}.
	 * @param ctx the parse tree
	 */
	void exitSmall_start(HtmlParser.Small_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#small_end}.
	 * @param ctx the parse tree
	 */
	void enterSmall_end(HtmlParser.Small_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#small_end}.
	 * @param ctx the parse tree
	 */
	void exitSmall_end(HtmlParser.Small_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#strong_start}.
	 * @param ctx the parse tree
	 */
	void enterStrong_start(HtmlParser.Strong_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#strong_start}.
	 * @param ctx the parse tree
	 */
	void exitStrong_start(HtmlParser.Strong_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#strong_end}.
	 * @param ctx the parse tree
	 */
	void enterStrong_end(HtmlParser.Strong_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#strong_end}.
	 * @param ctx the parse tree
	 */
	void exitStrong_end(HtmlParser.Strong_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#em_start}.
	 * @param ctx the parse tree
	 */
	void enterEm_start(HtmlParser.Em_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#em_start}.
	 * @param ctx the parse tree
	 */
	void exitEm_start(HtmlParser.Em_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#em_end}.
	 * @param ctx the parse tree
	 */
	void enterEm_end(HtmlParser.Em_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#em_end}.
	 * @param ctx the parse tree
	 */
	void exitEm_end(HtmlParser.Em_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#u_start}.
	 * @param ctx the parse tree
	 */
	void enterU_start(HtmlParser.U_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#u_start}.
	 * @param ctx the parse tree
	 */
	void exitU_start(HtmlParser.U_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#u_end}.
	 * @param ctx the parse tree
	 */
	void enterU_end(HtmlParser.U_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#u_end}.
	 * @param ctx the parse tree
	 */
	void exitU_end(HtmlParser.U_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#b_start}.
	 * @param ctx the parse tree
	 */
	void enterB_start(HtmlParser.B_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#b_start}.
	 * @param ctx the parse tree
	 */
	void exitB_start(HtmlParser.B_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#b_end}.
	 * @param ctx the parse tree
	 */
	void enterB_end(HtmlParser.B_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#b_end}.
	 * @param ctx the parse tree
	 */
	void exitB_end(HtmlParser.B_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#i_start}.
	 * @param ctx the parse tree
	 */
	void enterI_start(HtmlParser.I_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#i_start}.
	 * @param ctx the parse tree
	 */
	void exitI_start(HtmlParser.I_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#i_end}.
	 * @param ctx the parse tree
	 */
	void enterI_end(HtmlParser.I_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#i_end}.
	 * @param ctx the parse tree
	 */
	void exitI_end(HtmlParser.I_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#sub_start}.
	 * @param ctx the parse tree
	 */
	void enterSub_start(HtmlParser.Sub_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#sub_start}.
	 * @param ctx the parse tree
	 */
	void exitSub_start(HtmlParser.Sub_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#sub_end}.
	 * @param ctx the parse tree
	 */
	void enterSub_end(HtmlParser.Sub_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#sub_end}.
	 * @param ctx the parse tree
	 */
	void exitSub_end(HtmlParser.Sub_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#sup_start}.
	 * @param ctx the parse tree
	 */
	void enterSup_start(HtmlParser.Sup_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#sup_start}.
	 * @param ctx the parse tree
	 */
	void exitSup_start(HtmlParser.Sup_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#sup_end}.
	 * @param ctx the parse tree
	 */
	void enterSup_end(HtmlParser.Sup_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#sup_end}.
	 * @param ctx the parse tree
	 */
	void exitSup_end(HtmlParser.Sup_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tt_start}.
	 * @param ctx the parse tree
	 */
	void enterTt_start(HtmlParser.Tt_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tt_start}.
	 * @param ctx the parse tree
	 */
	void exitTt_start(HtmlParser.Tt_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tt_end}.
	 * @param ctx the parse tree
	 */
	void enterTt_end(HtmlParser.Tt_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tt_end}.
	 * @param ctx the parse tree
	 */
	void exitTt_end(HtmlParser.Tt_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#ul_start}.
	 * @param ctx the parse tree
	 */
	void enterUl_start(HtmlParser.Ul_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#ul_start}.
	 * @param ctx the parse tree
	 */
	void exitUl_start(HtmlParser.Ul_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#ul_end}.
	 * @param ctx the parse tree
	 */
	void enterUl_end(HtmlParser.Ul_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#ul_end}.
	 * @param ctx the parse tree
	 */
	void exitUl_end(HtmlParser.Ul_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#ol_start}.
	 * @param ctx the parse tree
	 */
	void enterOl_start(HtmlParser.Ol_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#ol_start}.
	 * @param ctx the parse tree
	 */
	void exitOl_start(HtmlParser.Ol_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#ol_end}.
	 * @param ctx the parse tree
	 */
	void enterOl_end(HtmlParser.Ol_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#ol_end}.
	 * @param ctx the parse tree
	 */
	void exitOl_end(HtmlParser.Ol_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#li_start}.
	 * @param ctx the parse tree
	 */
	void enterLi_start(HtmlParser.Li_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#li_start}.
	 * @param ctx the parse tree
	 */
	void exitLi_start(HtmlParser.Li_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#li_end}.
	 * @param ctx the parse tree
	 */
	void enterLi_end(HtmlParser.Li_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#li_end}.
	 * @param ctx the parse tree
	 */
	void exitLi_end(HtmlParser.Li_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#table_start}.
	 * @param ctx the parse tree
	 */
	void enterTable_start(HtmlParser.Table_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#table_start}.
	 * @param ctx the parse tree
	 */
	void exitTable_start(HtmlParser.Table_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#table_end}.
	 * @param ctx the parse tree
	 */
	void enterTable_end(HtmlParser.Table_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#table_end}.
	 * @param ctx the parse tree
	 */
	void exitTable_end(HtmlParser.Table_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tbody_start}.
	 * @param ctx the parse tree
	 */
	void enterTbody_start(HtmlParser.Tbody_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tbody_start}.
	 * @param ctx the parse tree
	 */
	void exitTbody_start(HtmlParser.Tbody_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tbody_end}.
	 * @param ctx the parse tree
	 */
	void enterTbody_end(HtmlParser.Tbody_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tbody_end}.
	 * @param ctx the parse tree
	 */
	void exitTbody_end(HtmlParser.Tbody_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tr_start}.
	 * @param ctx the parse tree
	 */
	void enterTr_start(HtmlParser.Tr_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tr_start}.
	 * @param ctx the parse tree
	 */
	void exitTr_start(HtmlParser.Tr_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#tr_end}.
	 * @param ctx the parse tree
	 */
	void enterTr_end(HtmlParser.Tr_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#tr_end}.
	 * @param ctx the parse tree
	 */
	void exitTr_end(HtmlParser.Tr_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#td_start}.
	 * @param ctx the parse tree
	 */
	void enterTd_start(HtmlParser.Td_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#td_start}.
	 * @param ctx the parse tree
	 */
	void exitTd_start(HtmlParser.Td_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#td_end}.
	 * @param ctx the parse tree
	 */
	void enterTd_end(HtmlParser.Td_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#td_end}.
	 * @param ctx the parse tree
	 */
	void exitTd_end(HtmlParser.Td_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#a_start}.
	 * @param ctx the parse tree
	 */
	void enterA_start(HtmlParser.A_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#a_start}.
	 * @param ctx the parse tree
	 */
	void exitA_start(HtmlParser.A_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#a_end}.
	 * @param ctx the parse tree
	 */
	void enterA_end(HtmlParser.A_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#a_end}.
	 * @param ctx the parse tree
	 */
	void exitA_end(HtmlParser.A_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dl_start}.
	 * @param ctx the parse tree
	 */
	void enterDl_start(HtmlParser.Dl_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dl_start}.
	 * @param ctx the parse tree
	 */
	void exitDl_start(HtmlParser.Dl_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dl_end}.
	 * @param ctx the parse tree
	 */
	void enterDl_end(HtmlParser.Dl_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dl_end}.
	 * @param ctx the parse tree
	 */
	void exitDl_end(HtmlParser.Dl_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dt_start}.
	 * @param ctx the parse tree
	 */
	void enterDt_start(HtmlParser.Dt_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dt_start}.
	 * @param ctx the parse tree
	 */
	void exitDt_start(HtmlParser.Dt_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dt_end}.
	 * @param ctx the parse tree
	 */
	void enterDt_end(HtmlParser.Dt_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dt_end}.
	 * @param ctx the parse tree
	 */
	void exitDt_end(HtmlParser.Dt_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dd_start}.
	 * @param ctx the parse tree
	 */
	void enterDd_start(HtmlParser.Dd_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dd_start}.
	 * @param ctx the parse tree
	 */
	void exitDd_start(HtmlParser.Dd_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dd_end}.
	 * @param ctx the parse tree
	 */
	void enterDd_end(HtmlParser.Dd_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dd_end}.
	 * @param ctx the parse tree
	 */
	void exitDd_end(HtmlParser.Dd_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#br}.
	 * @param ctx the parse tree
	 */
	void enterBr(HtmlParser.BrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#br}.
	 * @param ctx the parse tree
	 */
	void exitBr(HtmlParser.BrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#font_start}.
	 * @param ctx the parse tree
	 */
	void enterFont_start(HtmlParser.Font_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#font_start}.
	 * @param ctx the parse tree
	 */
	void exitFont_start(HtmlParser.Font_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#font_end}.
	 * @param ctx the parse tree
	 */
	void enterFont_end(HtmlParser.Font_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#font_end}.
	 * @param ctx the parse tree
	 */
	void exitFont_end(HtmlParser.Font_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(HtmlParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(HtmlParser.ImgContext ctx);
}