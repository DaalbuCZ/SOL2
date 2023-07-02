.class final Ld4/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ld4/z;


# direct methods
.method constructor <init>(Ld4/z;)V
    .locals 0

    iput-object p1, p0, Ld4/w;->n:Ld4/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ld4/w;->n:Ld4/z;

    invoke-static {v0}, Ld4/z;->n0(Ld4/z;)Ld4/y;

    move-result-object v0

    new-instance v1, Lb4/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lb4/b;-><init>(I)V

    invoke-interface {v0, v1}, Ld4/y;->b(Lb4/b;)V

    return-void
.end method
