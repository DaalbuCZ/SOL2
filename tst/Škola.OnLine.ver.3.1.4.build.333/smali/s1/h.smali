.class public final synthetic Ls1/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ls1/s;

.field public final synthetic o:Ll1/p;

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ls1/s;Ll1/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/h;->n:Ls1/s;

    iput-object p2, p0, Ls1/h;->o:Ll1/p;

    iput p3, p0, Ls1/h;->p:I

    iput-object p4, p0, Ls1/h;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ls1/h;->n:Ls1/s;

    iget-object v1, p0, Ls1/h;->o:Ll1/p;

    iget v2, p0, Ls1/h;->p:I

    iget-object v3, p0, Ls1/h;->q:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Ls1/s;->a(Ls1/s;Ll1/p;ILjava/lang/Runnable;)V

    return-void
.end method
