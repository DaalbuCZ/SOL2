.class public final synthetic Lo6/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln6/b;


# instance fields
.field public final synthetic a:Lk5/e;


# direct methods
.method public synthetic constructor <init>(Lk5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/d;->a:Lk5/e;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo6/d;->a:Lk5/e;

    invoke-static {v0}, Lcom/google/firebase/installations/c;->c(Lk5/e;)Lq6/b;

    move-result-object v0

    return-object v0
.end method
