.class public final synthetic Ls1/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ls1/w0;

.field public final synthetic o:Ls1/i1$e;


# direct methods
.method public synthetic constructor <init>(Ls1/w0;Ls1/i1$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/y;->n:Ls1/w0;

    iput-object p2, p0, Ls1/y;->o:Ls1/i1$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/y;->n:Ls1/w0;

    iget-object v1, p0, Ls1/y;->o:Ls1/i1$e;

    invoke-static {v0, v1}, Ls1/w0;->j0(Ls1/w0;Ls1/i1$e;)V

    return-void
.end method
