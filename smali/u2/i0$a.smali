.class Lu2/i0$a;
.super Lu2/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/i0;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lu2/i0;Ls1/l3;)V
    .locals 0

    invoke-direct {p0, p2}, Lu2/l;-><init>(Ls1/l3;)V

    return-void
.end method


# virtual methods
.method public k(ILs1/l3$b;Z)Ls1/l3$b;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lu2/l;->k(ILs1/l3$b;Z)Ls1/l3$b;

    const/4 p1, 0x1

    iput-boolean p1, p2, Ls1/l3$b;->s:Z

    return-object p2
.end method

.method public s(ILs1/l3$d;J)Ls1/l3$d;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lu2/l;->s(ILs1/l3$d;J)Ls1/l3$d;

    const/4 p1, 0x1

    iput-boolean p1, p2, Ls1/l3$d;->y:Z

    return-object p2
.end method
