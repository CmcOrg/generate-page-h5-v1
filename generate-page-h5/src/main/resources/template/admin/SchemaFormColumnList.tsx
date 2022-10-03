import {ProFormColumnsType} from "@ant-design/pro-form/lib/components/SchemaForm/typing";
import {AdminInsertOrUpdateDTO} from "@/api/admin/AdminController";

export const InitForm: AdminInsertOrUpdateDTO = {} as AdminInsertOrUpdateDTO

const SchemaFormColumnList = (): ProFormColumnsType<AdminInsertOrUpdateDTO>[] => {
    return [
        AdminFormJson
    ]
}

export default SchemaFormColumnList
