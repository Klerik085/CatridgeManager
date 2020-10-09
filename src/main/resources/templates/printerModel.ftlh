<#import "parts/common.ftlh" as c>
<@c.page>
 <div class="mb-1">Добавить модель принтера</div>
<#list printerModels as printerModel>
<div>${printerModel.name}</div>
</#list>

    <form action="/printer_model" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Название :</label>
            <div class="col-sm-6">
                <input type="text" name="name"
                       class="form-control"
                       placeholder="Название" />
            </div>
        </div>
        <button class="btn btn-primary" type="submit">Создать</button>
    </form>
</@c.page>
