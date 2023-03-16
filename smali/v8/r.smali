.class public final synthetic Lv8/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv8/t$b;


# instance fields
.field public final synthetic a:La8/f;


# direct methods
.method public synthetic constructor <init>(La8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/r;->a:La8/f;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv8/r;->a:La8/f;

    invoke-virtual {v0, p1, p2}, La8/f;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
