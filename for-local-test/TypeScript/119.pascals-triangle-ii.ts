// cmd to run => npx ts-node 119.pascals-triangle-ii.ts
function getRow(rowIndex: number): number[] {
    const row: number[] = [];
    for (let i = 0; i <= rowIndex; i++) {
        row.push(1);
    }
    for (let i = 1; i <= rowIndex; i++) {
        for (let j = i - 1; j >= 1; j--) {
            row[j] = (row[j] ?? 0) + (row[j - 1] ?? 0);
        }
    }
    return row;
}

// Test
console.log(getRow(6));