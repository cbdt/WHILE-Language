const execute = require('../utils');

test('appel 1', async () => {
    let result = await execute("testAppel1.wh", 678, 344);
    expect(result[0]).toEqual([678+344]);
});

test('appel division', async () => {
    let result = await execute("division.wh", 877, 84);
    expect(result[0]).toEqual([10, 37]);
});

test('appel multiplication', async () => {
    let result = await execute("multiplication.wh", 132, 84);
    expect(result[0]).toEqual([132*84]);
});

test('appel inferieur 1', async () => {
    let result = await execute("inferieur.wh", 22, 22);
    expect(result[0]).toEqual([0]);
});

test('appel inferieur 2', async () => {
    let result = await execute("inferieur.wh", 2, 222);
    expect(result[0]).toEqual([1]);
});