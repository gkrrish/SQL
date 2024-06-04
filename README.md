<td>
  <% if (isChangeApproval) { %>
    <td nowrap style="vertical-align: middle; color:#000000; display: flex">
      <div class="alert alert-info d-flex align-items-center">
        <i class="bficon bficon-check"></i>
        <span>Approved by <%=changeBY%></span>
      </div>
    </td>
  <% } else if (isChangeDecline) { %>
    <td nowrap style="vertical-align: middle; color:#000000; display: flex">
      <div class="alert alert-danger d-flex align-items-center">
        <i class="bficon bficon-cross"></i>
        <span><%=header%></span>
      </div>
    </td>
  <% } %>
</td>
