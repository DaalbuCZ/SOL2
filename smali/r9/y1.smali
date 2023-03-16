.class final Lr9/y1;
.super Lr9/e2;
.source ""


# instance fields
.field private final p:Lb9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb9/d<",
            "Ly8/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb9/g;Lj9/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g;",
            "Lj9/p<",
            "-",
            "Lr9/j0;",
            "-",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lr9/e2;-><init>(Lb9/g;Z)V

    invoke-static {p2, p0, p0}, Lc9/b;->a(Lj9/p;Ljava/lang/Object;Lb9/d;)Lb9/d;

    move-result-object p1

    iput-object p1, p0, Lr9/y1;->p:Lb9/d;

    return-void
.end method


# virtual methods
.method protected o0()V
    .locals 1

    iget-object v0, p0, Lr9/y1;->p:Lb9/d;

    invoke-static {v0, p0}, Lw9/a;->b(Lb9/d;Lb9/d;)V

    return-void
.end method
