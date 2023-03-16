.class public final synthetic Ls1/c2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ls1/d2;

.field public final synthetic o:Lb5/q$a;

.field public final synthetic p:Lu2/u$b;


# direct methods
.method public synthetic constructor <init>(Ls1/d2;Lb5/q$a;Lu2/u$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/c2;->n:Ls1/d2;

    iput-object p2, p0, Ls1/c2;->o:Lb5/q$a;

    iput-object p3, p0, Ls1/c2;->p:Lu2/u$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls1/c2;->n:Ls1/d2;

    iget-object v1, p0, Ls1/c2;->o:Lb5/q$a;

    iget-object v2, p0, Ls1/c2;->p:Lu2/u$b;

    invoke-static {v0, v1, v2}, Ls1/d2;->a(Ls1/d2;Lb5/q$a;Lu2/u$b;)V

    return-void
.end method
