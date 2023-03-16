.class public final synthetic Lk5/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lk5/y;

.field public final synthetic o:Li6/b;


# direct methods
.method public synthetic constructor <init>(Lk5/y;Li6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/m;->n:Lk5/y;

    iput-object p2, p0, Lk5/m;->o:Li6/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk5/m;->n:Lk5/y;

    iget-object v1, p0, Lk5/m;->o:Li6/b;

    invoke-static {v0, v1}, Lk5/o;->k(Lk5/y;Li6/b;)V

    return-void
.end method
