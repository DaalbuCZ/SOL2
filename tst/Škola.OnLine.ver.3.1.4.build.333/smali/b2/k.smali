.class public final synthetic Lb2/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb2/g;


# direct methods
.method public synthetic constructor <init>(Lb2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/k;->n:Lb2/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lb2/k;->n:Lb2/g;

    invoke-static {v0}, Lb2/h$h;->c(Lb2/g;)V

    return-void
.end method
