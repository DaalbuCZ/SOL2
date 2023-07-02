.class public final synthetic Lb2/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb2/h$f;

.field public final synthetic o:Lx1/n1;


# direct methods
.method public synthetic constructor <init>(Lb2/h$f;Lx1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/j;->n:Lb2/h$f;

    iput-object p2, p0, Lb2/j;->o:Lx1/n1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb2/j;->n:Lb2/h$f;

    iget-object v1, p0, Lb2/j;->o:Lx1/n1;

    invoke-static {v0, v1}, Lb2/h$f;->c(Lb2/h$f;Lx1/n1;)V

    return-void
.end method
