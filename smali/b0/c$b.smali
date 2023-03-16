.class public Lb0/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb0/c$b$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lb0/c$a;

.field public final d:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lb0/c$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/c$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lb0/c$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lb0/c$b;->c:Lb0/c$a;

    iput-boolean p4, p0, Lb0/c$b;->d:Z

    return-void
.end method

.method public static a(Landroid/content/Context;)Lb0/c$b$a;
    .locals 1

    new-instance v0, Lb0/c$b$a;

    invoke-direct {v0, p0}, Lb0/c$b$a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
