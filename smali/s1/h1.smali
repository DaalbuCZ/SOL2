.class public final synthetic Ls1/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ls1/i1;

.field public final synthetic o:Ls1/t2;


# direct methods
.method public synthetic constructor <init>(Ls1/i1;Ls1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/h1;->n:Ls1/i1;

    iput-object p2, p0, Ls1/h1;->o:Ls1/t2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/h1;->n:Ls1/i1;

    iget-object v1, p0, Ls1/h1;->o:Ls1/t2;

    invoke-static {v0, v1}, Ls1/i1;->f(Ls1/i1;Ls1/t2;)V

    return-void
.end method
