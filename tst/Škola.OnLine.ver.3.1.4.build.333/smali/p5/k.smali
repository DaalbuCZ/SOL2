.class public final synthetic Lp5/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lp5/y;

.field public final synthetic o:Ln6/b;


# direct methods
.method public synthetic constructor <init>(Lp5/y;Ln6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/k;->n:Lp5/y;

    iput-object p2, p0, Lp5/k;->o:Ln6/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp5/k;->n:Lp5/y;

    iget-object v1, p0, Lp5/k;->o:Ln6/b;

    invoke-static {v0, v1}, Lp5/o;->k(Lp5/y;Ln6/b;)V

    return-void
.end method
