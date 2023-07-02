.class public final synthetic Ld9/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld9/t$c;


# instance fields
.field public final synthetic a:Li8/f;


# direct methods
.method public synthetic constructor <init>(Li8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/s;->a:Li8/f;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld9/s;->a:Li8/f;

    invoke-virtual {v0, p1}, Li8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
