/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2016-11-08 09:45:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.icp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tab1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>待办工单</title>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t.datagrid-btable tr{ height:42px;}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t//var status_data = [{\"value\":\"1\",\"text\":\"草稿\"},{\"value\":\"2\",\"text\":\"提交\"},{\"value\":\"3\",\"text\":\"受理\"},{\"value\":\"4\",\"text\":\"归档\"},{\"value\":\"5\",\"text\":\"办结\"}];\r\n");
      out.write("\t\t\t\tresoursequery_datagrid = $('#dg1').datagrid({\r\n");
      out.write("\t\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/homepage/queryToDo.do',\r\n");
      out.write("\t\t\t\t\tqueryParams: {\r\n");
      out.write("\t\t\t\t\t\ttype: '1',\r\n");
      out.write("\t\t\t\t\t\tsort: 'ctime',\r\n");
      out.write("\t\t\t\t\t\torder: 'desc'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t pagination:true,//分页控件\r\n");
      out.write("\t\t\t\t\t showFooter:false,\r\n");
      out.write("\t\t\t\t\t width:'100%',\r\n");
      out.write("\t\t\t\t\t height:295,\r\n");
      out.write("\t\t\t\t\tpageSize:5,\r\n");
      out.write("\t\t\t\t\tpageList:[5],\r\n");
      out.write("\t\t\t\t\talign:'center',\r\n");
      out.write("\t\t\t\t\thalign:'center',\r\n");
      out.write("\t\t\t\t\tfitColumns:true,\r\n");
      out.write("\t\t\t\t\tborder:false,\r\n");
      out.write("\t\t\t\t\tscrollbarSize:0,\r\n");
      out.write("\t\t\t\t\tidField:'rmdid',\r\n");
      out.write("\t\t\t\t\tsortOrder:'asc',\r\n");
      out.write("\t\t\t\t\tsingleSelect:true,\r\n");
      out.write("\t\t\t\t\tonClickRow:function(rowIndex,rowData){\r\n");
      out.write("\t\t\t\t\t\twindow.parent.window.parent.querymenu('%/workOrderMg/toDoOrderList.jsp%');\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tcolumns:[[{\r\n");
      out.write("\t\t\t\t\t\ttitle:'序号',\r\n");
      out.write("\t\t\t\t\t\tfield:'rmdid',\r\n");
      out.write("\t\t\t\t\t\twidth:'20%',\r\n");
      out.write("\t\t\t\t\t\talign:'center',\r\n");
      out.write("\t\t\t\t\t\t styler: function(value,row,index){\r\n");
      out.write("                                    return 'vertical-align:middle;';\r\n");
      out.write("                            },\r\n");
      out.write("\t\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\t\tswitch (index) {\r\n");
      out.write("\t\t\t\t\t\t\t\tcase 0:\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<span>1</span>\";\r\n");
      out.write("\t\t\t\t\t\t\t\tcase 1:\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<span>2</span>\";\r\n");
      out.write("\t\t\t\t\t\t\t\tcase 2:\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<span>3</span>\";\r\n");
      out.write("\t\t\t\t\t\t\t\tcase 3:\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<span>4</span>\";\r\n");
      out.write("\t\t\t\t\t\t\t\tcase 4:\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<span>5</span>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\ttitle:'标题',\r\n");
      out.write("\t\t\t\t\t\tfield:'flowname',\r\n");
      out.write("\t\t\t\t\t\twidth:'30%',\r\n");
      out.write("\t\t\t\t\t\tfit:true,\r\n");
      out.write("\t\t\t\t\t\talign:'center',\r\n");
      out.write("\t\t\t\t\t\tstyler: function(value,row,index){\r\n");
      out.write("                                    return 'vertical-align:middle;';\r\n");
      out.write("                            },\r\n");
      out.write("\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\ttitle:'工单状态',\r\n");
      out.write("\t\t\t\t\t\tfield:'fstatus',\r\n");
      out.write("\t\t\t\t\t\twidth:'20%',\r\n");
      out.write("\t\t\t\t\t\talign:'center',\r\n");
      out.write("\t\t\t\t\t\tstyler: function(value,row,index){\r\n");
      out.write("                                    return 'vertical-align:middle;';\r\n");
      out.write("                            },\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\ttitle:'发起时间',\r\n");
      out.write("\t\t\t\t\t\tfield:'ctime',\r\n");
      out.write("\t\t\t\t\t\twidth:'30%',\r\n");
      out.write("\t\t\t\t\t\talign:'center',\r\n");
      out.write("\t\t\t\t\t\tstyler: function(value,row,index){\r\n");
      out.write("                                    return 'vertical-align:middle;';\r\n");
      out.write("                            },\r\n");
      out.write("\t\t\t\t\t\tformatter:function(value,row,index){\r\n");
      out.write("\t\t\t\t\t\t   return translateDate(value);\r\n");
      out.write("\t\t\t\t\t\t },\r\n");
      out.write("\t\t\t\t\t}]]\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t//转换日期格式 \"yyyy-MM-dd HH:mm:ss\"\r\n");
      out.write("\tfunction translateDate(value){\r\n");
      out.write("\t\tvar timeStr = value;\r\n");
      out.write("\t\tvar time = value;\r\n");
      out.write("\t\tif(timeStr.length>14){\r\n");
      out.write("\t\t\tvar date = timeStr.slice(0, 10) + ' ';\r\n");
      out.write("\t\t\tvar time = timeStr.slice(11, 19);\r\n");
      out.write("\t\t\ttime = date + time;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar year = timeStr.slice(0, 4) + '-';\r\n");
      out.write("\t\t\tvar month = timeStr.slice(4,6) + '-';\r\n");
      out.write("\t\t\tvar day = timeStr.slice(6,8) + ' ';\r\n");
      out.write("\t\t\tvar hour = timeStr.slice(8,10) + ':';\r\n");
      out.write("\t\t\tvar min = timeStr.slice(10,12) + ':';\r\n");
      out.write("\t\t\tvar sec = timeStr.slice(12,14); \r\n");
      out.write("\t\t\ttime = year + month + day + hour + min + sec;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn time;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\t\t<div class=\"easyui-layout\" data-options=\"fit:true,border:false\" >\r\n");
      out.write("\t\t\t<div data-options=\"region:'center',border:false\" style=\"background:#eee;\">\r\n");
      out.write("\t\t\t\t<table id=\"dg1\" style=\"background:#eee;width:100%;text-align:center;\"></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
