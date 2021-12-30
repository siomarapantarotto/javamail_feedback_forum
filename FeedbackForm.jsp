<HTML>

<HEAD>
<TITLE>Feedback Forum</TITLE>
</HEAD>

<BODY>

<table border="0" width="100%">
  <tr>
    <td width="19%"><img border="0" src="yourLogo.gif" width="79" height="94"><br>
      <font size="1"><b>Your logo comes here</b></font></td>
    <td width="68%">
      <p align="center"><b><font size="6"><font color="#009933" size="6">XYZ.com</font>
      Feedback Forum<br>
      </font></b>Please fill out this form and submit it. Thank you.</td>
    <td width="13%"></td>
  </tr>
</table>

<form method="POST" action="http://10.1.11.72:8080/bugTrack/servlet/InsertNewFeedback">

<TABLE width="842" height="85" border="0">

<TR>
<TD ALIGN="right" width="128" height="25"><STRONG>My name:</STRONG></TD>
<TD width="700" height="25" colspan="3"><INPUT NAME="name" SIZE=70></TD>
</TR>

<TR>
<TD ALIGN="right" width="128" height="25"><STRONG>Address:</STRONG></TD>
<TD width="700" height="25" colspan="3"><INPUT NAME="address" SIZE=70></TD>
</TR>

<TR>
<TD ALIGN="right" width="128" height="25"><STRONG>City:</STRONG></TD>
<TD width="700" height="25" colspan="3"><INPUT NAME="city" SIZE=70></TD>
</TR>

<TR>
<TD ALIGN="right" width="128" height="25"><STRONG>State:</STRONG></TD>
<TD width="700" height="25" colspan="3"><INPUT NAME="state" SIZE=2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <STRONG>Zip: </STRONG><INPUT NAME="zip" SIZE=10>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <STRONG>Country:</STRONG><INPUT NAME="country" SIZE=10 VALUE="USA"></TD>
</TR>

<TR>
<TD ALIGN="right" width="128" height="25"><STRONG>My email:</STRONG></TD>
<TD width="700" height="25" colspan="3"><INPUT NAME="email" SIZE=70></TD>
</TR>

<TR>
<TD ALIGN="right" width="128" height="25" valign="top"><STRONG>Category:</STRONG></TD>
<TD width="234" height="25" valign="top" align="left">
  <table border="0" width="100%">
    <tr>
      <TD width="104">
<TABLE>
<TR>
<TD><INPUT NAME="category" TYPE="radio" VALUE="Issue" checked>
</TD>
<TD>Issue</TD>
</TR>
<TR>
<TD><INPUT NAME="category" TYPE="radio" VALUE="Suggestion">
</TD>
<TD>Suggestion</TD>
</TR>
<TR>
<TD><INPUT NAME="category" TYPE="radio" VALUE="Other">
</TD>
<TD>Other</TD>
</TR>
</TABLE>
</TD>
    </tr>
    <tr>
      <td width="100%"></td>
    </tr>
  </table>
</TD>
<TD width="127" height="25" valign="top" align="right"><STRONG>Considerations:</STRONG>
</TD>
<TD width="339" height="25" valign="top" align="left">
  <table border="0" width="253">
    <tr>
      <TD width="245">
<TABLE>
<TR>
<TD><INPUT NAME="confidential" TYPE="checkbox"
VALUE="Keep it confidential"></TD>
<TD><EM>Keep it confidential</EM></TD>
</TR>
<TR>
<TD><INPUT NAME="critical" TYPE="checkbox"
VALUE="Mark it as Critical"></TD>
<TD><EM>Mark it as Critical</EM></TD>
</TR>
<TR>
<TD><INPUT NAME="ceo" TYPE="checkbox"
VALUE="notify ceo"></TD>
<TD><EM>I would like CEO's to be notified</EM></TD>
</TR>

</TABLE>
</TD>
    </tr>
    <tr>
      <td width="245"></td>
    </tr>
  </table>
</TD>
</TR>

<TR>
<TD ALIGN="right" width="128" height="25"><STRONG>Related Area:</STRONG></TD>
<TD width="700" height="25" colspan="3">
<SELECT NAME="area">
<OPTION VALUE="MKT">Marketing
<OPTION SELECTED VALUE="HR">Human Resource
<OPTION VALUE="ES">Engineering Support
<OPTION VALUE="PE">Product Engineering
<OPTION VALUE="OTH">Other
</SELECT>
</TD>
</TR>

<TR>
<TD align="right" width="128" valign="top" height="138"><STRONG>My feedback is:</STRONG></TD>
<TD width="700" height="138" colspan="3" valign="top">
<TEXTAREA NAME="feedback" ROWS=8 COLS=86 WRAP="virtual">
</TEXTAREA>
</TD>
</TR>

<TR>
<TD align="right" width="828" valign="top" height="26" colspan="4"></TD>
</TR>

<TR>
<TD align="right" width="828" valign="top" height="26" colspan="4">
  <p align="center"><INPUT TYPE="submit" value="Submit Feedback" name="btnSubmit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <INPUT TYPE="reset">
</TD>
</TR>

</TABLE>

</FORM>
</BODY>
</HTML>
