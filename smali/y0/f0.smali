.class public Ly0/f0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ly0/k0;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "(.)/(.*?)\\s*\\(([\\d\\s]+)\\):\\s(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ly0/f0;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ly0/k0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/f0;->a:Ly0/k0;

    iput-object p2, p0, Ly0/f0;->b:Ljava/lang/String;

    iput-object p3, p0, Ly0/f0;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;I)Ly0/f0;
    .locals 5

    sget-object v0, Ly0/f0;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    const-string v1, "The trace is not valid"

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v0

    const/4 v2, 0x4

    if-lt v0, v2, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {p0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v2, p1, :cond_1

    new-instance p1, Ly0/f0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ly0/k0;->e(C)Ly0/k0;

    move-result-object v0

    invoke-direct {p1, v0, v3, p0}, Ly0/f0;-><init>(Ly0/k0;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_1
    new-instance p0, Ly0/u2;

    invoke-direct {p0, v1}, Ly0/u2;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    new-instance p0, Ly0/u2;

    invoke-direct {p0, v1}, Ly0/u2;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ly0/u2;

    invoke-direct {p0, v1}, Ly0/u2;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ly0/u2;

    invoke-direct {p0, v1}, Ly0/u2;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Ly0/k0;
    .locals 1

    iget-object v0, p0, Ly0/f0;->a:Ly0/k0;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/f0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/f0;->b:Ljava/lang/String;

    return-object v0
.end method
