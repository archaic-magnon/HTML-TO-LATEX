/*
----------------------------------------
			PARSER RULES
----------------------------------------
*/


grammar Html;
options { tokenVocab=HtmlLexer; }

root : html_start  html_content  html_end EOF ;
html_content: head_start  head_content  head_end  body ;
head_content: title_start  title_content  title_end;
title_content: (HTML_TEXT | WHITE_SPACE);
body: body_start  body_content  body_end;

body_content: text? general_content+ text?;

general_content: text* tag_open text* general_content*  text* tag_close text* | text* special_content text*;
special_content: table | a_link | br | font | img | html_latex_char | greek_text;

tag_open:   p_start | div_start | h1_start  | h2_start  | h3_start  | h4_start  | center_start  | small_start   | strong_start  | em_start  | u_start   | b_start   | i_start   | sub_start | sup_start | tt_start  | ul_start  | ol_start  | li_start  | dl_start  | dt_start  | dd_start;
tag_close:  p_end   | div_end   | h1_end    | h2_end    | h3_end    | h4_end    | center_end    | small_end     | strong_end    | em_end    | u_end     | b_end     | i_end     | sub_end   | sup_end   | tt_end    | ul_end    | ol_end    | li_end    | dl_end    | dt_end    | dd_end;
text: html_chardata;

table: table_start tbody_start? tbody_content tbody_end? table_end;
tbody_content: (tr_start tr_content tr_end)+ ;
tr_content: (td_start td_content td_end)+;
td_content: html_chardata;

a_link: a_start a_content? a_end;
a_content: html_chardata;

font: font_start font_content font_end;
font_content: html_chardata;

html_chardata
    : (HTML_TEXT | WHITE_SPACE);
html_latex_char: HTML_LATEX_CHAR;
greek_text: GREEK_TEXT;

html_comment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

html_start:   HTML_START;
html_end:   HTML_END ;

head_start: HEAD_START;
head_end: HEAD_END;

title_start: TITLE_START;
title_end: TITLE_END;

body_start: BODY_START;
body_end: BODY_END;

p_start: P_START;
p_end: P_END;

div_start: DIV_START;
div_end: DIV_END;

h1_start: H1_START;
h1_end: H1_END;

h2_start: H2_START;
h2_end: H2_END;

h3_start: H3_START;
h3_end: H3_END;

h4_start: H4_START;
h4_end: H4_END;

center_start: CENTER_START;
center_end: CENTER_END;

small_start: SMALL_START;
small_end: SMALL_END;

strong_start: STRONG_START;
strong_end: STRONG_END;

em_start: EM_START;
em_end: EM_END;

u_start: U_START;
u_end: U_END;

b_start: B_START;
b_end: B_END;

i_start: I_START;
i_end: I_END;

sub_start: SUB_START;
sub_end: SUB_END;

sup_start: SUP_START;
sup_end: SUP_END;

tt_start: TT_START;
tt_end: TT_END;

ul_start: UL_START;
ul_end: UL_END;

ol_start: OL_START;
ol_end: OL_END;

li_start: LI_START;
li_end: LI_END;

table_start: TABLE_START;
table_end: TABLE_END;

tbody_start: TBODY_START;
tbody_end: TBODY_END;

tr_start: TR_START;
tr_end: TR_END;

td_start: TD_START;
td_end: TD_END;

a_start: A_START;
a_end: A_END;

dl_start: DL_START;
dl_end: DL_END;

dt_start: DT_START;
dt_end: DT_END;

dd_start: DD_START;
dd_end: DD_END;

br: BR;

font_start: FONT_START;
font_end: FONT_END;

img: IMG;


