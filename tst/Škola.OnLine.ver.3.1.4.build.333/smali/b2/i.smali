.class public final synthetic Lb2/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb2/h$f;


# direct methods
.method public synthetic constructor <init>(Lb2/h$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/i;->n:Lb2/h$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lb2/i;->n:Lb2/h$f;

    invoke-static {v0}, Lb2/h$f;->b(Lb2/h$f;)V

    return-void
.end method
