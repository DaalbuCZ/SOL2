.class final Lz9/y1;
.super Lz9/e2;
.source ""


# instance fields
.field private final p:Lj9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/d<",
            "Lg9/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/g;Lr9/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g;",
            "Lr9/p<",
            "-",
            "Lz9/j0;",
            "-",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lz9/e2;-><init>(Lj9/g;Z)V

    invoke-static {p2, p0, p0}, Lk9/b;->a(Lr9/p;Ljava/lang/Object;Lj9/d;)Lj9/d;

    move-result-object p1

    iput-object p1, p0, Lz9/y1;->p:Lj9/d;

    return-void
.end method


# virtual methods
.method protected o0()V
    .locals 1

    iget-object v0, p0, Lz9/y1;->p:Lj9/d;

    invoke-static {v0, p0}, Lea/a;->b(Lj9/d;Lj9/d;)V

    return-void
.end method
