.class public final synthetic Lw1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw1/h$f;

.field public final synthetic o:Ls1/m1;


# direct methods
.method public synthetic constructor <init>(Lw1/h$f;Ls1/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/j;->n:Lw1/h$f;

    iput-object p2, p0, Lw1/j;->o:Ls1/m1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw1/j;->n:Lw1/h$f;

    iget-object v1, p0, Lw1/j;->o:Ls1/m1;

    invoke-static {v0, v1}, Lw1/h$f;->c(Lw1/h$f;Ls1/m1;)V

    return-void
.end method
