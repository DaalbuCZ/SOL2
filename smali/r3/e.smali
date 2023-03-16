.class public final synthetic Lr3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr3/f;


# direct methods
.method public synthetic constructor <init>(Lr3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/e;->n:Lr3/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr3/e;->n:Lr3/f;

    invoke-static {v0}, Lr3/f;->a(Lr3/f;)V

    return-void
.end method
