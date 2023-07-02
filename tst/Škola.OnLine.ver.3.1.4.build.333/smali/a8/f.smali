.class public final synthetic La8/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc5/b;


# instance fields
.field public final synthetic a:La8/e;


# direct methods
.method public synthetic constructor <init>(La8/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/f;->a:La8/e;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, La8/f;->a:La8/e;

    check-cast p1, Lcom/google/android/play/core/install/InstallState;

    invoke-static {v0, p1}, La8/e$f;->a(La8/e;Lcom/google/android/play/core/install/InstallState;)V

    return-void
.end method
