.class Lz2/i0$a;
.super Lz2/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz2/i0;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lz2/i0;Lx1/y3;)V
    .locals 0

    invoke-direct {p0, p2}, Lz2/l;-><init>(Lx1/y3;)V

    return-void
.end method


# virtual methods
.method public k(ILx1/y3$b;Z)Lx1/y3$b;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lz2/l;->k(ILx1/y3$b;Z)Lx1/y3$b;

    const/4 p1, 0x1

    iput-boolean p1, p2, Lx1/y3$b;->s:Z

    return-object p2
.end method

.method public s(ILx1/y3$d;J)Lx1/y3$d;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lz2/l;->s(ILx1/y3$d;J)Lx1/y3$d;

    const/4 p1, 0x1

    iput-boolean p1, p2, Lx1/y3$d;->y:Z

    return-object p2
.end method
