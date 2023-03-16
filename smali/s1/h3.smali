.class public final synthetic Ls1/h3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ls1/g3;


# direct methods
.method public synthetic constructor <init>(Ls1/g3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/h3;->n:Ls1/g3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls1/h3;->n:Ls1/g3;

    invoke-static {v0}, Ls1/g3$c;->a(Ls1/g3;)V

    return-void
.end method
