.class public final synthetic Lx1/u3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/t3;


# direct methods
.method public synthetic constructor <init>(Lx1/t3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/u3;->n:Lx1/t3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx1/u3;->n:Lx1/t3;

    invoke-static {v0}, Lx1/t3$c;->a(Lx1/t3;)V

    return-void
.end method
