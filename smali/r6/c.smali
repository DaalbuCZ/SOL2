.class public final synthetic Lr6/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk5/h;


# instance fields
.field public final synthetic a:Lk5/f0;


# direct methods
.method public synthetic constructor <init>(Lk5/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/c;->a:Lk5/f0;

    return-void
.end method


# virtual methods
.method public final a(Lk5/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/c;->a:Lk5/f0;

    invoke-static {v0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->b(Lk5/f0;Lk5/e;)Lr6/b;

    move-result-object p1

    return-object p1
.end method
