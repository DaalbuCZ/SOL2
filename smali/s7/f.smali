.class public final synthetic Ls7/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx4/b;


# instance fields
.field public final synthetic a:Ls7/e;


# direct methods
.method public synthetic constructor <init>(Ls7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/f;->a:Ls7/e;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ls7/f;->a:Ls7/e;

    check-cast p1, Lcom/google/android/play/core/install/InstallState;

    invoke-static {v0, p1}, Ls7/e$f;->a(Ls7/e;Lcom/google/android/play/core/install/InstallState;)V

    return-void
.end method
