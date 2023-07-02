.class public final synthetic Lx4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx4/a;


# direct methods
.method public synthetic constructor <init>(Lx4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/b;->n:Lx4/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx4/b;->n:Lx4/a;

    invoke-static {v0}, Lx4/a;->e(Lx4/a;)V

    return-void
.end method
